/*
 * Coin Collection, an Android app that helps users track the coins that they've collected
 * Copyright (C) 2010-2016 Andrew Williams
 *
 * This file is part of Coin Collection.
 *
 * Coin Collection is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Coin Collection is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Coin Collection.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.spencerpages.collections;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class CollectionInfo {

    abstract public int getCoinSlotImage(
            String identifier,
            String mint,
            Boolean inCollection);

    abstract public String getCoinType();

    abstract public int getCoinImageIdentifier();

    abstract public void getCreationParameters(
            HashMap<String, Object> parameters);

    abstract public void populateCollectionArrays(
            HashMap<String, Object> parameters,
            ArrayList<String> identifierList,
            ArrayList<String> mintList);
}
