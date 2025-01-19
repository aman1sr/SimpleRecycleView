package com.example.recinrecview

import com.example.recinrecview.model.NewsResponse

object Utils {
    fun getStaticNewsData(): List<NewsResponse>{
        val newsList = ArrayList<NewsResponse>()
        newsList.add(NewsResponse(0,",Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(1,"0,FIFA news", "messi scores 3goals over armenai...", "https://cdn.britannica.com/35/238335-050-2CB2EB8A/Lionel-Messi-Argentina-Netherlands-World-Cup-Qatar-2022.jpg"))
        newsList.add(NewsResponse(2,"0,Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse(3,"Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(4,"Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse(5,"Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(6,"MMA news", "john john defends his title ...", "https://a.espncdn.com/media/motion/2024/1117/dm_241117_dm_ufc_jon_jones_hl/dm_241117_dm_ufc_jon_jones_hl.jpg"))
        newsList.add(NewsResponse(7,"Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse(8,"Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(9,"FIFA news", "messi scores 3goals over armenai...", "https://cdn.britannica.com/35/238335-050-2CB2EB8A/Lionel-Messi-Argentina-Netherlands-World-Cup-Qatar-2022.jpg"))
        newsList.add(NewsResponse(10,"Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse(11,"Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(12,"Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))
        newsList.add(NewsResponse(13,"Golf news", "xyz scores 3 kxd...", "https://play-lh.googleusercontent.com/7IDe_dSGxA6x_52PcF8X40Wf9vGzOLNQgUKz_XU22PH3_Z6yStnoVu8xCYmYItfBLA"))
        newsList.add(NewsResponse(14,"MMA news", "john john defends his title ...", "https://a.espncdn.com/media/motion/2024/1117/dm_241117_dm_ufc_jon_jones_hl/dm_241117_dm_ufc_jon_jones_hl.jpg"))
        newsList.add(NewsResponse(15,"Cricket news", "dhoni scores 300...", "https://m.economictimes.com/thumb/msid-100814251,width-1200,height-900,resizemode-4,imgsize-56458/concerns-over-dhonis-well-being-and-recovery-became-a-point-of-discussion-for-fans-.jpg"))

        return newsList
    }
}