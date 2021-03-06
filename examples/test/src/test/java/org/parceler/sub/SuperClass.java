/**
 * Copyright 2013 John Ericksen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.parceler.sub;

import org.parceler.Transient;

/**
 * @author John Ericksen
 */
public abstract class SuperClass {

    public String one;
    String two;
    protected String three;
    private String four;
    private String extra;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    String getTwo() {
        return two;
    }

    void setTwo(String two) {
        this.two = two;
    }

    protected String getThree() {
        return three;
    }

    protected void setThree(String three) {
        this.three = three;
    }

    private String getFour() {
        return four;
    }

    private void setFour(String four) {
        this.four = four;
    }

    @Transient
    public String getSuperOne() {
        return one;
    }

    public void setSuperOne(String one) {
        this.one = one;
    }

    @Transient
    public String getSuperTwo() {
        return two;
    }

    public void setSuperTwo(String two) {
        this.two = two;
    }

    @Transient
    public String getSuperThree() {
        return three;
    }

    public void setSuperThree(String three) {
        this.three = three;
    }

    @Transient
    public String getSuperFour() {
        return four;
    }

    public void setSuperFour(String four) {
        this.four = four;
    }

    public final String getFinal() {
        return extra;
    }

    public final void setFinal(String extra) {
        this.extra = extra;
    }
}
