/*
 * Copyright 2017 Danang Galuh Tegar P.
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
package com.jogjadamai.infest.communication;

/**
 * <h1>class <code>CustomerClient</code></h1>
 * <p><code>CustomerClient</code> is a <code>ProtocolClient</code> class 
 * layer that has specially specified for Infest Customer client.</p>
 * <br>
 * <p><b><i>Coded, built, and packaged with passion by Danang Galuh Tegar P for Infest.</i></b></p>
 * 
 * @author Danang Galuh Tegar P
 * @version 2017.03.10
 * @see java.rmi.Remote
 * @see com.jogjadamai.infest.communication.ProtocolClient
 */
public final class CustomerClient extends ProtocolClient {
    
    public CustomerClient() throws java.rmi.RemoteException {
        super(IProtocolClient.Type.CUSTOMER, 1159584749);
    }
    
}
