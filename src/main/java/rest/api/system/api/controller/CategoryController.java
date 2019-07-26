package rest.api.system.api.controller;

import static rest.api.system.base.WebConst.*;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import rest.api.system.api.resource.Resource;
import rest.api.system.entity.Category;
import rest.api.system.service.CategoryService;

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
  @ApiOperation(value = "カテゴリー情報取得" , httpMethod = "GET" , response = Category.class )
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
