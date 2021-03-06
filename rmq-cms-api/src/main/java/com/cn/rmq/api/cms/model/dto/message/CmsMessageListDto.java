package com.cn.rmq.api.cms.model.dto.message;

import cn.hutool.json.JSONUtil;
import com.cn.rmq.api.cms.model.dto.PageReq;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>Title:</p>
 * <p>Description:</p>
 *
 * @author Chen Nan
 * @date 2019/3/14.
 */
@Getter
@Setter
public class CmsMessageListDto extends PageReq {
    private String id;

    private String consumerQueue;

    private Byte alreadyDead;

    private Byte status;

    /**
     * 创建时间起
     */
    private String createStartTime;

    /**
     * 创建时间止
     */
    private String createEndTime;

    public String getCreateStartTime() {
        if (StringUtils.isBlank(createStartTime)) {
            return null;
        }
        return createStartTime;
    }

    public String getCreateEndTime() {
        if (StringUtils.isBlank(createEndTime)) {
            return null;
        }
        return createEndTime;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
