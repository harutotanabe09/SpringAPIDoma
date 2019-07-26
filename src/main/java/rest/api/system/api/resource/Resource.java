package rest.api.system.api.resource;

import java.util.List;
import rest.api.system.entity.dto.Dto;

public interface Resource {

  List<? extends Dto> getData();

  void setData(List<? extends Dto> data);

  String getMessage();

  void setMessage(String message);
}
