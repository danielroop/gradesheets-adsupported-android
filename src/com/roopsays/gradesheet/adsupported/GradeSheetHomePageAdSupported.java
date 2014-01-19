package com.roopsays.gradesheet.adsupported;

import android.os.Bundle;

import com.roopsays.gradesheet.foundation.GradeSheetHomePage;
import com.roopsays.gradesheet.foundation.util.Toggles;

public class GradeSheetHomePageAdSupported extends GradeSheetHomePage {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Toggles.ENABLE_ADS.override(true);
	}

}
