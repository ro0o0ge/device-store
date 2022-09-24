package com.devices.store.common.responses;

import com.devices.store.common.consts.enums.ResponseStatusEnum;

public class ResponseHeader {

    private ResponseStatusEnum status=ResponseStatusEnum.SUCCESS;

    public ResponseStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ResponseStatusEnum status) {
        this.status = status;
    }
}
