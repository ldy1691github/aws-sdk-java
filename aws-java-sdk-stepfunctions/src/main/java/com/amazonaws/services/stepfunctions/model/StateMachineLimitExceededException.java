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
package com.amazonaws.services.stepfunctions.model;

/**
 * <p>
 * The maximum number of state machines has been reached. Existing state machines must be deleted before a new state
 * machine can be created.
 * </p>
 */
public class StateMachineLimitExceededException extends com.amazonaws.services.stepfunctions.model.AWSStepFunctionsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new StateMachineLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public StateMachineLimitExceededException(String message) {
        super(message);
    }

}
