/*
 * Copyright (c) 2014 SBG Apps
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

package com.faizmalkani.floatingactionbutton;

import android.view.View;
import android.widget.AbsListView;

/**
 * Created by Stéphane on 09/07/2014.
 * Modified by Davide Dellai 28/08/2014
 */
class DirectionScrollListener implements AbsListView.OnScrollListener {

    private static final int DIRECTION_CHANGE_THRESHOLD = 1;
    private final FloatingActionButton mFloatingActionButton;
    private int mPrevPosition;
    private int mPrevTop;
    private boolean mUpdated;

    DirectionScrollListener(FloatingActionButton floatingActionButton) {
        mFloatingActionButton = floatingActionButton;
    }
    
   // Fixed scroll
   @Override
   public void onScroll(AbsListView view, int firstVisibleItem,
       int visibleItemCount, int totalItemCount) {
     if(mPrevPosition != firstVisibleItem){
       if (firstVisibleItem < mPrevPosition ) 
           mFloatingActionButton.hide(false);
        else 
           mFloatingActionButton.hide(true);

       mPrevPosition = firstVisibleItem;
     }
   }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
    }
}
