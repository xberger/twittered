package io.github.redouane59.twitter.dto.dm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
public class DmParameters {

  @JsonProperty("conversation_type")
  @Builder.Default
  private String       conversationType = "Group";
  @JsonProperty("message")
  private DmMessage    message;
  @JsonProperty("participant_ids")
  private List<String> participantIds;

  @Builder
  @Getter
  public static class DmMessage {

    private String text;
    private String attachments; // @to be improved
  }
}
