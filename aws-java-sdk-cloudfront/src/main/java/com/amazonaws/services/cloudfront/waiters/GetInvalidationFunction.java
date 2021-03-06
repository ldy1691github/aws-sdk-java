/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.amazonaws.services.cloudfront.waiters;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.cloudfront.model.GetInvalidationRequest;
import com.amazonaws.services.cloudfront.model.GetInvalidationResult;
import com.amazonaws.services.cloudfront.AmazonCloudFront;

@SdkInternalApi
public class GetInvalidationFunction implements SdkFunction<GetInvalidationRequest, GetInvalidationResult> {

    /**
     * Represents the service client
     */
    private final AmazonCloudFront client;

    /**
     * Constructs a new GetInvalidationFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public GetInvalidationFunction(AmazonCloudFront client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param getInvalidationRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public GetInvalidationResult apply(GetInvalidationRequest getInvalidationRequest) {
        return client.getInvalidation(getInvalidationRequest);
    }
}
