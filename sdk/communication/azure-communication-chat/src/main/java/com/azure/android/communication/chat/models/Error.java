// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Error model. */
@Immutable
public final class Error {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Description of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * If applicable, would be used to indicate the property causing the error.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * If applicable, inner errors would be returned for more details on the
     * error.
     */
    @JsonProperty(value = "innerErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<Error> innerErrors;

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: Description of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: If applicable, would be used to indicate the property causing the error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the innerErrors property: If applicable, inner errors would be returned for more details on the error.
     *
     * @return the innerErrors value.
     */
    public List<Error> getInnerErrors() {
        return this.innerErrors;
    }
}