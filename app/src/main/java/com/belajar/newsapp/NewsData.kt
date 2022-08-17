package com.belajar.newsapp

object NewsData {
    private val newsAuthor = arrayOf(
        "Punta Dewa, Tim TvOne",
        "Akbar Hari Mukti",
        "Dwi Rahmawati",
        "M Julnis Firmansyah",
        "Septian Farhan Nurhuda",
        "Baitur Rohman",
        "Ilham Sigit Pratama",
        "Iskandar",
        "CNN Indonesia",
        "Ilyas Fadhillah"
    )
    private val newsDescription = arrayOf(
        "Bharada E Sebut Ada Peristiwa di Magelang yang Memicu Brigadir J Ditembak Mati atas Perintah Irjen Ferdy Sambo - tvOneNews.com. Berita Bharada E Sebut Ada Peristiwa di Magelang yang Memicu Brigadir J Ditembak Mati atas Perintah Irjen Ferdy Sambo terbaru hari ini 2022-08-14 18:32:41 dari sumber yang terpercaya",
        "Download Aplikasi GB WhatsApp Mod 16.00 Asli Gunakan 3 Link DISINI - Ayo Semarang - ayosemarang.com. Dengan memiliki 2 akun di satu device saja, maka akan membuat GB WhatsApp ini mendukung pekerjaan Anda.",
        "LPSK Ungkap Kondisi Bharada E Baik di Tahanan: Sudah Terbuka - detikNews. Bharada E masih ditahan di Rutan Bareskrim Polri. LPSK mengatakan kondisi Bharada E di dalam tahanan terpantau baik.",
        "LPSK Sebut Kuasa Hukum Brigadir J Menolak Advokasi soal Restitusi - Nasional Tempo. Kepada penyidik, Ferdy Sambo merencanakan pembunuhan Brigadir J di Magelang. Namun, dirinya baru melakukan eksekusi itu saat tiba di Jakarta",
        "Comeback! Minerva Rilis Skuter Listrik, Harga Rp 16 Jutaan - detikOto. Kini, Minerva mengubah namanya menjadi Minerva Electron dan meluncurkan skuter listrik Electron M1.",
        "Laporan Dugaan Pelecehan Dihentikan, Pakar Hukum Sebut Istri Ferdy Sambo Berpeluang Jadi Tersangka - Kompas TV. Putri Candrawathi berpeluang jadi tersangka karena dinilai membuat laporan pelecehan seksual palsu ke pihak kepolisian.",
        "Dihujat Netizen karena Ikut Angkat Trofi Bersama Timnas Indonesia U-16, Menpora Zainudin Amali Beri Klarifikasi - Bola Okezone. Menpora Amali Beri Klarifikasi Usai Dihujat Warganet Karena Ikut Angkat Trofi Bersama Timnas Indonesia U-16. ",
        "Unboxing Samsung Galaxy Z Fold 4 5G, Dimensi Lebih Compact dan Ringan - Liputan6.com. Unit Samsung Galaxy Z Fold 4 5G yang kami peroleh berwarna Graygreen, yang merupakan salah satu warna andalan.",
        "Alasan Keluarga Bharada E Cabut Kuasa Deolipa: Kebanyakan 'Manggung' - CNN Indonesia. Pengacara Baru Bharada E membeberkan alasan mengapa kliennya berhenti menggunakan jasa Deolipa Yumara sebagai pengacara. ",
        "Anak Buah Jokowi Beri Sinyal Harga BBM Bakal Naik, Pertamina Bilang Begini - detikFinance. Menteri Investasi/Kepala Badan Koordinasi Penanaman Modal (BKPM) Bahlil Lahadalia memberi sinyal jika harga Bahan Bakar Minyak (BBM) akan naik."
    )

    private val newsImages = intArrayOf(
        R.drawable.berita_satu,
        R.drawable.berita_dua,
        R.drawable.berita_tiga,
        R.drawable.berita_empat,
        R.drawable.berita_lima,
        R.drawable.berita_enam,
        R.drawable.berita_tujuh,
        R.drawable.berita_delapan,
        R.drawable.berita_sembilan,
        R.drawable.berita_sepuluh
    )
    val listData: ArrayList<News>
        get() {
            val list = arrayListOf<News>()
            for (position in newsAuthor.indices) {
                val news = News()
                news.author = newsAuthor[position]
                news.description = newsDescription[position]
                news.photo = newsImages[position]
                list.add(news)
            }
            return list
        }
}