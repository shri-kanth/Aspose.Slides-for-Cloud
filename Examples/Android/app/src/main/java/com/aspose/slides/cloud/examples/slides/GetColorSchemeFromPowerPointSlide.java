package com.aspose.slides.cloud.examples.slides;

import android.content.Context;

import java.io.Console;
import java.io.File;
import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.cloud.examples.R;
import com.aspose.slides.cloud.examples.common.Configuration;
import com.aspose.slides.cloud.examples.common.Utils;
import com.aspose.slides.model.ColorScheme;
import com.aspose.slides.model.ColorSchemeResponse;
import com.aspose.storage.api.StorageApi;

public class GetColorSchemeFromPowerPointSlide {

	public static void  execute(Context context)  throws Exception  {
		//ExStart: 1
		String fileName = "demo.pptx";
		int slideIndex = 1;
		String folder = "";
		String storage = "";
		File inputFile = Utils.stream2file("demo","pptx", context.getResources().openRawResource(R.raw.demo));

		try
		{
			SlidesApi slidesApi = new SlidesApi(Configuration.apiKey, Configuration.appSID);
			StorageApi storageApi = new StorageApi(Configuration.apiKey, Configuration.appSID, true);
		    // Upload source file to aspose cloud storage
		    storageApi.PutCreate(fileName, "", "",inputFile);

		    // Invoke Aspose.Slides Cloud SDK API to get slide color scheme
		    ColorSchemeResponse apiResponse = slidesApi.GetSlidesThemeColorScheme(fileName, slideIndex, folder, storage);

		    if (apiResponse != null && apiResponse.getStatus().equals("OK"))
		    {
		        ColorScheme colorScheme = apiResponse.getColorScheme();
		        System.out.println("Accent1 : " + colorScheme.getAccent1());
		        System.out.println("Accent3 : " + colorScheme.getAccent2());
		        System.out.println("Dark1 : " + colorScheme.getDark1());
		        System.out.println("Dark2 : " + colorScheme.getDark2());
		        System.out.println("Light1 : " + colorScheme.getLight1());
		        System.out.println("Get Color Scheme of a PowerPoint Slide, Done!");
		    }
		}
		catch (Exception ex)
		{
		   ex.printStackTrace();
		}
		//ExEnd: 1
	}
}
