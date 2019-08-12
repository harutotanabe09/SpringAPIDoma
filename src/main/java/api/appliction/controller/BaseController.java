package api.appliction.controller;

import api.appliction.api.resource.DefaultResourceFactoryImpl;
import api.appliction.api.resource.ResourceFactory;
import api.appliction.utils.MessageUtils;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

public class BaseController {

  public static final String VALIDATION_ERROR = "ValidationError";

  @Autowired protected ApplicationContext applicationContext;

  @Bean
  public ResourceFactory resourceFactory() {
    return new DefaultResourceFactoryImpl();
  }

  /**
   * 入力エラーの共通メッセージを返します。
   *
   * @return
   */
  protected String getValidationErrorMessage() {
    return getMessage(VALIDATION_ERROR);
  }

  /**
   * コンテキストを返します。
   *
   * @return
   */
  protected ApplicationContext getApplicationContext() {
    return applicationContext;
  }

  /**
   * メッセージを取得します。
   *
   * @param key
   * @param args
   * @return
   */
  protected String getMessage(String key, Object... args) {
    return MessageUtils.getMessage(key, args);
  }

  /**
   * ロケールを指定してメッセージを取得します。
   *
   * @param key
   * @param args
   * @param locale
   * @return
   */
  protected String getMessage(String key, Object[] args, Locale locale) {
    return MessageUtils.getMessage(key, args, locale);
  }
}
