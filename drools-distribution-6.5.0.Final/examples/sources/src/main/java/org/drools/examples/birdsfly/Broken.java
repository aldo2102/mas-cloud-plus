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

package org.drools.examples.birdsfly;

public class Broken {
    private Bird bird;
    private String part;

    public Broken(Bird bird, String part) {
        this.bird = bird;
        this.part = part;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Broken{" +
               "bird=" + bird +
               ", part='" + part + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        Broken broken = (Broken) o;

        if (!bird.equals(broken.bird)) { return false; }
        if (!part.equals(broken.part)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        int result = bird.hashCode();
        result = 31 * result + part.hashCode();
        return result;
    }
}
