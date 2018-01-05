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
package com.jogjadamai.infest.customer;

/**
 *
 * @author Danang Galuh Tegar P
 */
public class Program {
    
    private static MainGUI MainGUI;
    private static Thread MainThread;
    private static Customer Controller;
    
    public static void main(String[] args) {
        Program.MainGUI = new MainGUI();
        Program.MainThread = new Thread(Program.MainGUI);
        Program.MainThread.setName("Main Thread Customer");
        java.awt.EventQueue.invokeLater(Program.MainThread);
        Program.Controller = Customer.createInstance(Program.MainGUI);
        Program.Controller.onFirstRun();
    }
    
}
