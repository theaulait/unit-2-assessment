package nyc.c4q.model;

/**
 * Created by cfalc on 6/21/15.
 */

import com.google.gson.annotations.SerializedName;
import nyc.c4q.model.PhotosInfo;

public class FlickrResponse {

	@SerializedName("photos") public PhotosInfo mPhotosInfo;

	@SerializedName("stat") public String mStatus;

	@Override public String toString() {
		return "GetRecentPhotosResponse{" +
				"mPhotosInfo=" + mPhotosInfo +
				", mStatus='" + mStatus + '\'' +
				'}';
	}
}