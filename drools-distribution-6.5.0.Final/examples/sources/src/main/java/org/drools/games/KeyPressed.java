/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.games;

import org.kie.api.definition.type.Position;

public class KeyPressed {
    
    @Position(0)
    private String keyText;

    public KeyPressed(String keyText) {
        this.keyText = keyText;
    }
    
    public String getKeyText() {
        return keyText;
    }

    public void setKeyText(String keyText) {
        this.keyText = keyText;
    }

    @Override
    public String toString() {
        return "KeyPressed [keyText=" + keyText + "]";
    }        
    
    
}
