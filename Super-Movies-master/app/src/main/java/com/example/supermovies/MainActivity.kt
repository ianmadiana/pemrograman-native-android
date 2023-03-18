package com.example.supermovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //companion object untuk intent parcelable
    companion object{
        val INTENT_PARCELABLE= "OBJECT_INTENT"
    }

    //fungsi pada proses onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //List berisi data-data film yang akan ditampilkan
        val moviesList = listOf<Movies>(
            Movies(
                R.drawable.sing2_desk,
                "Sing 2",
                "Sekuel ini menceritakan Buster yang ambisius ingin membawa pertunjukannya dari sekedar pertunjukan lokal dan masuk ke pertunjukan berskala besar yang tentunya dengan lebih banyak penonton pula. Buster dan kelompoknya termasuk, si babi Rosita (Reese Whiterspoon) dan Gunther (Nick Kroll), sang landak Ash (Scarlett Johansson), si gajah yang pemalu Meena (Tory Kelly) juga sang gorilla Johnny (Taron Egerton) semuanya kembali.Buster membawa mereka ke Redshore City untuk mengikuti audisi dari mega produser Jimmy Crystal (Bobby Cannavale) dan ketika audisi mereka ditolak. Buster menjanjikan Jimmy untuk membawa bintang rock Clay Calloway (Bono) keluar dari pengasingan dan kembali ke panggung."
            ),
            Movies(
                R.drawable.the355,
                "The 355",
                "Film yang disutradarai oleh Simon Kinberg ini menceritakan kisah empat mata-mata internasional dengan seorang terapis, yang membentuk tim dan memiliki misi menghancurkan sebuah perangkat yang dinilai memiliki potensi Perang Dunia III. Walaupun, menampilkan beberapa bintang besar yang semuanya perempuan, The 355 tidak memiliki alasan lain yang lebih menarik untuk dipertontonkan. Judul film ini terinspirasi oleh Agen 355, nama kode yang diciptakan selama Revolusi Amerika untuk mata-mata wanita."
            ),
            Movies(
                R.drawable.scream_desk,
                "Scream",
                "Sudah setengah abad berlalu, Billy Loomis dan Stu Macher sebagai Ghostface menyerang kota Woodsbro. Lalu, beberapa anggota lainnya menyerang siswi SMA, Tara Carpenter (Jenna Ortega) yang saat itu sedang sendiri di rumah. Ia terluka parah, tapi masih bisa bertahan hidup. Kemudian, sang kakak, Sam Carpenter (Melissa Barrera), datang menemui Tara di rumah sakit bersama kekasihnya, Richie (Jack Quaid). Ia juga bertemu dengan teman-teman Tara yang sudah lama tidak saling berkomunikasi. Beberapa jam usai menjenguk, Sam diserang oleh Ghostface. Apa yang sebenarnya terjadi? Siapa anggota Ghostface yang sekarang kembali menyerang kota Woodsbro? Nah, semua rasa penasaran tersebut bisa kamu atasi dengan menonton film Scream 2022 di bioskop-bioskop terdekat. Selamat menonton!"
            ),
            Movies(
                R.drawable.morbius,
                "Morbius",
                "Sinopsis Morbius berpusat di sekitar karakter Dr. Michael Morbius, ahli biologi dan biokimia Yunani yang menderita penyakit darah langka. Dia mencoba obat berbahaya yang justru mengubahnya jadi seperti vampir. Saat bepergian ke New York, Morbius berusaha menemukan obat untuk penyakit langka yang dideritanya seumur hidup. Untuk melakukan itu, Morbius bereksperimen dengan pengobatan radikal yang melibatkan DNA kelelawar vampir dan terapi kejut listrik. Alih-alih sembuh, Morbius malah menderita penyakit yang jauh lebih buruk, membuatnya haus darah seperti vampir. Namun dia juga mendapatkan kemampuan persis makhluk supernatural tersebut."
            ),
            Movies(
                R.drawable.uncharted_desk,
                "Uncharted",
                "Uncharted menceritakan tentang Nathan Drake yang direkrut oleh pemburu harta karun Sully untuk mengembalikan harta yang dikumpulkan oleh Ferdinand Magellan. Harta itu diketahui sudah hilang selama 500 tahun lalu di House of Moncada. Perjalanan yang awalnya sederhana, ternyata membawah dua karakter utama Uncharted menjadi perjalanan keliling dunia. Terlebih, keduanya berhadapan dengan Santiago Moncada (Antonio Banderas) yang merasa ia dan keluarganya merupakan pewaris sah dari harta tersebut. Untuk itu, Nathan dan Sully bekerja sama untuk bisa memecahkan salah satu misteri tertua di dunia. Tidak hanya harta, dalam pencarian ini juga kemungkinan akan menemukan saudara laki-laki Nathan Drake yang telah lama hilang."
            ),
            Movies(
                R.drawable._563782,
                "Turning Red",
                "Turning Red bercerita tentang Mei Lee (disuarakan oleh Rosalie Chiang) yang merupakan seorang gadis remaja berusia 13 tahun. Mei Lee berkepribadian unik dan memiliki rasa percaya diri yang tinggi. Dalam film ini, diceritakan Mei Lee menghadapi dilema antara tumbuh menjadi anak baik demi membanggakan ibunya atau bersenang-senang menikmati masa remajanya dengan teman-teman. Dalam fase tumbuh dewasa tersebut, Mei Lee terkadang menjadi tak terkontrol dan sering bertengkar dengan ibunya karena perbedaan pendapat. Hingga pada suatu hari, Mei Lee mengalami situasi unik. Dirinya tiba-tiba berubah menjadi panda merah raksasa setiap kali merasa emosinya meledak. Lantas, akankah Mei Lee dapat berubah menjadi manusia normal pada umumnya?"
            ),
            Movies(
                R.drawable.the_batman,
                "The Batman",
                "Di film kali ini, nama Batman memang belum tenar. Sosoknya yang misterius malah membuat banyak polisi curiga, kecuali James Gordon (Jeffrey Wright). Ketika topeng dibuka, Bruce Wayne adalah seorang penyendiri yang enggan bergaul. Jauh dari kesan playboy yang digambarkan Bruce Wayne di versi terdahulu, Bruce di film ini lebih sering menutup diri akibat tragedi yang menimpa keluarganya. Konsentrasinya difokuskan saat dia beroperasi sebagai Batman, memangsa para kriminal yang berbuat sesuka hati di kota Gotham yang suram."
            ),
            Movies(
                R.drawable.nightmare_alley,
                "Nightmare Alley",
                "Kisah film Nightmare Alley mengambil era tahun 1930-1940 an di Amerika Serikat. Film ini menceritakan seseorang bernama Stanton Carlisle (Bradley Cooper) yang merupakan petugas karnaval keliling yang memiliki bakat untuk memanipulasi orang-orang kaya. Stanton Carlisle memiliki kecerdasan yang mudah untuk memanipulasi orang lain sehingga mudah percaya dengannya. Pada suatu ketika, Stanton Carlisle bertemu dengan Dr Lilith Ritter (Cate Blanchett) yang merupakan seorang psikiater. Ia bersama Dr Lilith Ritter merencanakan sebuah penipuan kepada pengusaha kaya raya namun hal ini adalah salah satu penipuan paling berbahaya yang bisa membahayakan keduanya. Lalu mampukah keduanya berhasil untuk melakukan penipuan tersebut?"
            ),
            Movies(
                R.drawable.daone,
                "Downtown Abbey A New Era",
                "Film ini bercerita tentang keluarga Crawley dan staf Downton saat persiapan untuk perjalanan ke luar negeri. Violet yang merupakan seorang janda Countes of Grantham mewarisi sebuah villa megah di Perancis Selatan dari seorang teman lama. Violet kemudian menyerahkan villa tersebut kepada Sybil dan Putri Tom, karena ia merupakan satu-satunya cicit yang masa depannya tidak aman. Sementara itu, seorang pembuat film mendpaat izin dari Mary untuk shooting film di Downton Abbey. Robert tidak menyetujui hal ini karena menurutnya membuat aktor dengan riasan berkeliling seluruh rumah merupakan hal yang buruk. Untuk menghindari pembuatan \"film menakutkan\" ini beberapa anggota keluarga, termasuk Robert, Tom dan pengantin barunya Lucy, serta ibu Lucy, Maud, melakukan perjalanan ke selatan Prancis untuk memecahkan misteri mengapa teman Violet mewarisi villa untuknya."
            ),
            Movies(
                R.drawable.death_on_the_nile,
                "Death on The Nile",
                "kisah dimulai dalam perjalanan kapal pesiar mewah S.S Karnak yang melaju di peraian Sungai Nil. Ketenangan dan kemewahan mulai terusik kala salah satu penumpang ditemukan tewas. Setelah diselidiki, ternyata penumpang tersebut tewas karena dibunuh. Beruntung Hercule Poirot, detektif terbaik asal Belgia adalah salah satu penumpang di kapal tersebut. Poirot yang dihormati dan terkenal akan kecerdasan dan intuisinya yang tajam dalam memecahkan berbagai kasus pembunuhan ini kemudian dipercayakan untuk menemukan pembunuhnya diantara para penumpang sebelum jatuh korban lagi."
            )
        )

        //mengatur recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.rv_movie)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperMoviesAdapter(this, moviesList){
            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}