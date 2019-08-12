package api.appliction.api.controller;

import static api.appliction.base.WebConst.*;

import api.appliction.api.resource.Resource;
import api.appliction.entity.Category;
import api.appliction.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/categries")
public class CategoryController extends AbstractRestController {

  @Autowired CategoryService categoryService;

  /**
   * ユーザーを取得します。
   *
   * @param userId
   * @return
   */
  @ApiOperation(value = "カテゴリー情報取得", httpMethod = "GET", response = Category.class)
  @GetMapping(value = "/{categoryId}")
  public Resource show(@PathVariable int categoryId) {
    // 1件取得する
    Category item = categoryService.findById(categoryId);
    Resource resource = resourceFactory.create();
    resource.setData(Arrays.asList(item));
    resource.setMessage(getMessage(MESSAGE_SUCCESS));
    return resource;
  }
}
