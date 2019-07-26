package rest.api.system.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import rest.api.system.api.resource.ResourceFactory;
import rest.api.system.controller.BaseController;

/** 基底APIコントローラー */
@ResponseStatus(HttpStatus.OK)
@Slf4j
public abstract class AbstractRestController extends BaseController {

  @Autowired protected ResourceFactory resourceFactory;
}
