/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.net.ssl;

/**JSSE信任管理器的标记接口，目的是用来分组信任管理器，信任管理器的任务就是处理信任数据，做出是否接受对端的证书的决策
 * The marker interface for JSSE trust managers. The purpose is to group trust
 * managers. The responsibility a trust manager is to handle the trust data used to
 * make trust decisions for deciding whether credentials of a peer should be
 * accepted,
 * @see TrustManagerFactory
 */
public interface TrustManager {
}
