/*
 *     Minecraft GUI Server
 *     Copyright (C) 2015  Samuel Marchildon-Lavoie
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package djxy.models;

import djxy.models.component.ComponentState;

public class ButtonEvent {

    private String componentIdToUpdate;
    private ComponentState state;
    private String attribute;
    private Object value;

    public ButtonEvent(String componentIdToUpdate, ComponentState state, String attribute, Object value) {
        this.componentIdToUpdate = componentIdToUpdate;
        this.state = state;
        this.attribute = attribute;
        this.value = value;
    }

    public void setComponentIdToUpdate(String componentIdToUpdate) {
        this.componentIdToUpdate = componentIdToUpdate;
    }

    public void setState(ComponentState state) {
        this.state = state;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getComponentIdToUpdate() {
        return componentIdToUpdate;
    }

    public ComponentState getState() {
        return state;
    }

    public String getAttribute() {
        return attribute;
    }

    public Object getValue() {
        return value;
    }

    public ButtonEvent clone(){
        return new ButtonEvent(this.componentIdToUpdate, this.state, this.attribute, this.value);
    }
}
