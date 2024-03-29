package api.appliction.api.controller;

import api.appliction.api.resource.ResourceFactory;
import api.appliction.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** 基底APIコントローラー */
@ResponseStatus(HttpStatus.OK)
@Slf4j
public abstract class AbstractRestController extends BaseController {

  @Autowired protected ResourceFactory resourceFactory;
}
