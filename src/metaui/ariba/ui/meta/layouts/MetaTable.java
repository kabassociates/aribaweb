/*
    Copyright 2008 Craig Federighi

    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
    file except in compliance with the License.
    You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    $Id: //ariba/platform/ui/metaui/ariba/ui/meta/layouts/MetaTable.java#1 $
*/
package ariba.ui.meta.layouts;

import ariba.ui.aribaweb.core.AWComponent;

public class MetaTable extends AWComponent
{
    public Object _bindingsDictionary;

    protected void sleep ()
    {
        super.sleep();
        _bindingsDictionary = null;
    }
}
