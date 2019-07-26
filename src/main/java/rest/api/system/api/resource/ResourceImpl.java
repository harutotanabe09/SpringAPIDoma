package rest.api.system.api.resource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import rest.api.system.entity.dto.Dto;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceImpl implements Resource {

    List<? extends Dto> data;

    // メッセージ
    String message;
}