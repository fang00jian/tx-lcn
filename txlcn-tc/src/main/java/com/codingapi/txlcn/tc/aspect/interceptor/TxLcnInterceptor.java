/*
 * Copyright 2017-2019 CodingApi .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codingapi.txlcn.tc.aspect.interceptor;

import com.codingapi.txlcn.tc.aspect.BranchTransactionInterceptor;
import com.codingapi.txlcn.tc.aspect.weave.DTXLogicWeaver;

/**
 * Description: use {@link BranchTransactionInterceptor} instead.
 * Date: 1/12/19
 *
 * @author ujued
 * @see BranchTransactionInterceptor
 */
@Deprecated
public class TxLcnInterceptor extends BranchTransactionInterceptor {

    public TxLcnInterceptor(DTXLogicWeaver logicWeaver) {
        super(logicWeaver.branchContext());
    }
}