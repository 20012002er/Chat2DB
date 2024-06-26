package ai.chat2db.server.test.temp;

import com.github.vertical_blank.sqlformatter.SqlFormatter;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.Statements;

public class SQLParseTest {

    public static void main(String[] args) throws JSQLParserException {
        String sql = "CREATE OR REPLACE PROCEDURE public.raise_salary(emp_id integer, percentage numeric)\n"
            + " LANGUAGE plpgsql\n"
            + "AS $procedure$\n"
            + "BEGIN\n"
            + "    UPDATE employees\n"
            + "    SET salary = salary + (salary * percentage / 100)\n"
            + "    WHERE id = emp_id;\n"
            + "COMMIT;\n"
            + "END; -- sdsd\n"
            + "$procedure$";

        Statements statements = CCJSqlParserUtil.parseStatements(sql);

        // If there are multiple statements, the actual type after parsing is StatementList


        // Iterate through each statement
        for (Statement stmt : statements.getStatements()) {
            // If it is a single statement, the actual type is Statement
            System.out.println(stmt.toString());

            System.out.println(" dddd:"+SqlFormatter.format(stmt.toString()));
            System.out.println(" hu:"+ cn.hutool.db.sql.SqlFormatter.format(stmt.toString()));
        }
        String s = SqlFormatter.format("SELECT * FROM table1");
        System.out.println(s);



    }
}
