package com.riversoft.weixin.qy.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.riversoft.weixin.common.request.TextRequest;

/**
 * Created by exizhai on 9/29/2015.
 */
@JacksonXmlRootElement(localName = "xml")
public class QyTextRequest extends TextRequest {

    @JsonProperty("AgentID")
    private int agentId;

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

}
