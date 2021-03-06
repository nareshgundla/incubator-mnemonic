/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mnemonic.service.computingservice;

//import java.util.List;

public interface GeneralComputingService {
  /**
   * Provide the service identifier for this allocator
   *
   * @return the service identifier of this allocator
   */
  String getServiceId();

  /**
   * prepare native parameter frames for native execution
   *
   * @param npfs
   *         a list of frame of native parameter
   */
  // void setNativeParameterFrames(List<List<long[]>> npfs);

  /**
   * perform native functionalities according to prepared computing parameters
   *
   * @param mode
   *         a selection mode of run instance
   *
   * @param valinfos
   *         an array of value info
   *
   * @return the array of handler about updated object graphs if any
   */
  long[] perform(String mode, ValueInfo[] valinfos);

}
