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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3Resource JSON Unmarshaller
 */
public class S3ResourceJsonUnmarshaller implements Unmarshaller<S3Resource, JsonUnmarshallerContext> {

    public S3Resource unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3Resource s3Resource = new S3Resource();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BucketArn", targetDepth)) {
                    context.nextToken();
                    s3Resource.setBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyRange", targetDepth)) {
                    context.nextToken();
                    s3Resource.setKeyRange(KeyRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3Resource;
    }

    private static S3ResourceJsonUnmarshaller instance;

    public static S3ResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceJsonUnmarshaller();
        return instance;
    }
}
