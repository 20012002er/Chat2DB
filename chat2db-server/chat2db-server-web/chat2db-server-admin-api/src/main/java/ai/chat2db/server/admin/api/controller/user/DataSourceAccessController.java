
package ai.chat2db.server.admin.api.controller.user;

import ai.chat2db.server.admin.api.controller.user.converter.DataSourceAdminConverter;
import ai.chat2db.server.admin.api.controller.user.request.DataSourceAccessBatchCreateRequest;
import ai.chat2db.server.admin.api.controller.user.request.DataSourceAccessPageQueryRequest;
import ai.chat2db.server.admin.api.controller.user.vo.DataSourceAccessPageQueryVO;
import ai.chat2db.server.domain.api.service.DataSourceService;
import ai.chat2db.server.tools.base.wrapper.result.ActionResult;
import ai.chat2db.server.tools.base.wrapper.result.web.WebPageResult;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Data Source Access Management
 *
 * @author Jiaju Zhuang
 */
@RequestMapping("/api/admin/data/source/access")
@RestController
public class DataSourceAccessController {

    @Resource
    private DataSourceService dataSourceService;
    @Resource
    private DataSourceAdminConverter dataSourceAdminConverter;

    /**
     * Pagination query
     *
     * @param request
     * @return
     * @version 2.1.0
     */
    @GetMapping("/page")
    public WebPageResult<DataSourceAccessPageQueryVO> page(@Valid DataSourceAccessPageQueryRequest request) {
        return null;
    }

    /**
     * batch
     *
     * @param request
     * @return
     * @version 2.1.0
     */
    @PostMapping("/batch-create")
    public ActionResult batchCreate(@RequestBody DataSourceAccessBatchCreateRequest request) {
        return null;
    }

    /**
     * delete
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ActionResult delete(@PathVariable Long id) {
        return null;
    }

}