/*
 * Copyright 2016 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hannesdorfmann.mosby3.mvi.integrationtest.lifecycle.fragment;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.hannesdorfmann.mosby3.mvi.integrationtest.lifecycle.LifecycleTestPresenter;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class) public class MviFinishFragmentOnCreateTest {

  @Rule public ActivityTestRule<MviFinishOnCreateContainerActivity> rule =
      new ActivityTestRule<>(MviFinishOnCreateContainerActivity.class);

  private static LifecycleTestPresenter presenter;

  @Test public void screenOrientationChange() throws Exception {
    // Context of the app under test.
    MviFinishOnCreateContainerActivity portraitActivity = rule.getActivity();
    Thread.sleep(2000);
    Assert.assertNotNull(MviFinishOnCreateFragment.presenter);
    Assert.assertEquals(1, MviFinishOnCreateFragment.presenterCreatedCount);
    Assert.assertEquals(1, MviFinishOnCreateFragment.presenter.destoryInvoations);
  }

}
