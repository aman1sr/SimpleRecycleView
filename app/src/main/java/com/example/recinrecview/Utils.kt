package com.example.recinrecview

import com.example.recinrecview.model.NewsResponse

object Utils {
    fun getStaticNewsData(): List<NewsResponse>{
        val newsList = ArrayList<NewsResponse>()
        newsList.add(NewsResponse("Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse("FIFA news", "messi scores 3goals over armenai...", "https://cdn.britannica.com/35/238335-050-2CB2EB8A/Lionel-Messi-Argentina-Netherlands-World-Cup-Qatar-2022.jpg"))
        newsList.add(NewsResponse("FIFA news", "messi scores 3goals over armenai...", "https://cdn.britannica.com/35/238335-050-2CB2EB8A/Lionel-Messi-Argentina-Netherlands-World-Cup-Qatar-2022.jpg"))
        newsList.add(NewsResponse("Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse("Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse("Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse("Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse("Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse("Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse("MMA news", "john john defends his title ...", "https://a.espncdn.com/media/motion/2024/1117/dm_241117_dm_ufc_jon_jones_hl/dm_241117_dm_ufc_jon_jones_hl.jpg"))
        newsList.add(NewsResponse("Boxing news", "canelo prepare for his comming fight...", "https://cdn.shopify.com/s/files/1/0974/0510/files/Screen_Shot_2023-06-07_at_4.55.38_PM_480x480.png?v=1686182178"))
        newsList.add(NewsResponse("Boxing news", "canelo prepare for his comming fight...", "https://cdn.shopify.com/s/files/1/0974/0510/files/Screen_Shot_2023-06-07_at_4.55.38_PM_480x480.png?v=1686182178"))
        newsList.add(NewsResponse("Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse("Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))

        return newsList
    }
}