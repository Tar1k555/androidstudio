package com.example.myapplication1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_products)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recycleView = findViewById<RecyclerView>(R.id.rvProducts)

        val productList = listOf(
            Product(1, "Тіліфон", "Крутий,моцний", "https://i.etsystatic.com/12939509/r/il/a3a0c4/5581879967/il_fullxfull.5581879967_dv0c.jpg"),
            Product(2, "Пилосос", "Розумний(майже)", "https://i.allo.ua/media/catalog/product/cache/1/image/710x600/602f0fa2c1f0d1ba5e241f914e856ff9/r/c/rc4s_22.webp"),
            Product(3, "Качанчики", "Файний звук", "https://scdn.comfy.ua/89fc351a-22e7-41ee-8321-f8a9356ca351/https://cdn.comfy.ua/media/catalog/product/_/t/_tws_samsung_galaxy_buds3_pro_sm-r630nzaasek_silver_1_.jpg/w_600")

        )

        val adapter = ProductAdapter(productList)

        recycleView.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(this@ProductsActivity)
            setHasFixedSize(true)
        }
    }
}