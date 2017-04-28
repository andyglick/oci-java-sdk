/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import java.io.*;
import java.util.*;

import com.oracle.bmc.model.*;
import javax.ws.rs.core.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class CommitMultipartUploadResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, please provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Base-64 representation of the multipart object hash.
     * The multipart object hash is calculated by taking the MD5 hashes of the parts passed to this call,
     * concatenating the binary representation of those hashes in order of their part numbers,
     * and then calculating the MD5 hash of the concatenated values.
     *
     */
    private String opcMultipartMd5;

    /**
     * The entity tag for the object.
     */
    private String eTag;

    /**
     * The time the object was last modified, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     */
    private Date lastModified;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CommitMultipartUploadResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcMultipartMd5(o.getOpcMultipartMd5());
            eTag(o.getETag());
            lastModified(o.getLastModified());

            return this;
        }
    }
}