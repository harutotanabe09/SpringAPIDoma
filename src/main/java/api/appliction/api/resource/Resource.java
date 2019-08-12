package api.appliction.api.resource;

import api.appliction.entity.dto.Dto;
import java.util.List;

public interface Resource {

  List<? extends Dto> getData();

  void setData(List<? extends Dto> data);

  String getMessage();

  void setMessage(String message);
}
