package com.aspose.slides.cloud.examples.properties;

import android.content.Context;

import java.io.Console;
import java.io.File;
import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.cloud.examples.R;
import com.aspose.slides.cloud.examples.common.Configuration;
import com.aspose.slides.cloud.examples.common.Utils;
import com.aspose.slides.cloud.examples.shapes.ExtractParticularShape;
import com.aspose.slides.model.DocumentPropertiesResponse;
import com.aspose.storage.api.StorageApi;

public class RemoveDocumentProperties {

	public static void  execute(Context context)  throws Exception{
		//ExStart: 1
		String fileName = "sampleinput.pptx";
		String folder = "";
		String storage = "";
		File inputFile = Utils.stream2file("sample_input","pptx", context.getResources().openRawResource(R.raw.sampleinput));

		try
		{
			SlidesApi slidesApi = new SlidesApi(Configuration.apiKey, Configuration.appSID);
			StorageApi storageApi = new StorageApi(Configuration.apiKey, Configuration.appSID, true);

		    // Upload source file to aspose cloud storage
		    storageApi.PutCreate(fileName, "", "", inputFile);

		    // Invoke Aspose.Slides Cloud SDK API to remove all document properties
		    DocumentPropertiesResponse apiResponse = slidesApi.DeleteSlidesDocumentProperties(fileName, folder, storage);

		    if (apiResponse != null && apiResponse.getStatus().equals("OK"))
		    {
		    	System.out.println("Remove All Properties, Done!");
		    }
		}
		catch (Exception ex)
		{
		   ex.printStackTrace();

		}
		//ExEnd: 1
	}

}
