package com.goms.data.model.profile.response

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class ProfileResponse(
    @SerializedName("accountIdx") val accountIdx: UUID,
    @SerializedName("name") val name: String,
    @SerializedName("studentNum") val studentNum: StudentInfo,
    @SerializedName("profileUrl") val profileUrl: String?,
    @SerializedName("rateCount") val lateCount: Int
)
