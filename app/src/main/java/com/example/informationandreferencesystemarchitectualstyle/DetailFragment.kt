package com.example.informationandreferencesystemarchitectualstyle

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate


class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater , container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail , container , false)
    }

    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val detailText = view?.findViewById<TextView>(R.id.detailText)
        val detailText2 = view?.findViewById<TextView>(R.id.detailText2)
        val detailText3 = view?.findViewById<TextView>(R.id.detailText3)
        val detailText4 = view?.findViewById<TextView>(R.id.detailText4)
        val detailText5 = view?.findViewById<TextView>(R.id.detailText5)
        val detailText6= view?.findViewById<TextView>(R.id.detailText6)
        val detailText7 = view?.findViewById<TextView>(R.id.detailText7)
        val detailText8 = view?.findViewById<TextView>(R.id.detailText8)
        val detailText9 = view?.findViewById<TextView>(R.id.detailText9)
        val detailText10 = view?.findViewById<TextView>(R.id.detailText10)
        val textView = view?.findViewById<TextView>(R.id.textView3)
        val imageView = view?.findViewById<ImageView>(R.id.imageView)


        when (selectedItem) {
            "Архитектура древнего мира" -> {
                detailText?.text = getString(R.string.drewni_mir)
                detailText2?.text = getString(R.string.Vostok)
                detailText3?.text = getString(R.string.Egipet)
                detailText4?.text = getString(R.string.India)
                detailText5?.text = getString(R.string.Kitai)
                detailText6?.text = getString(R.string.Japn)
                detailText7?.text = getString(R.string.America)
                detailText8?.text = getString(R.string.Agaislaya)
                detailText9?.text = getString(R.string.Atrusskaya)
                textView?.text = getString(R.string.drevnimirPrimer)
                imageView?.setImageResource(R.drawable.piramida)
            }
            "Раннехристианская архитектура" -> {
                detailText?.text = getString(R.string.rannechristianskaya)
                detailText2?.text = getString(R.string.rannechristianskaya2)
                detailText3?.text = getString(R.string.rannechristianskaya3)
                detailText4?.text = getString(R.string.rannechristianskaya4)
                detailText5?.text = getString(R.string.rannechristianskaya5)
                detailText6?.text = getString(R.string.rannechristianskaya6)
                detailText7?.text = getString(R.string.rannechristianskaya7)
                detailText8?.text = getString(R.string.rannechristianskaya8)
                detailText9?.text = getString(R.string.rannechristianskaya9)
                textView?.text = getString(R.string.Dura)
                imageView?.setImageResource(R.drawable.domdura)
            }
            "Романская архитектура" -> {
                detailText?.text = getString(R.string.romanskaya)
                detailText2?.text = getString(R.string.romanskyStyle)
                detailText3?.text = getString(R.string.romanskyStyleText)
                detailText4?.text = getString(R.string.romanskyStyleText2)
                detailText5?.text = getString(R.string.romanskyStyleColors)
                detailText6?.text = getString(R.string.romanskyStylePrimer)
                detailText7?.text = getString(R.string.romanskyStylePrimerText)
                detailText8?.text = getString(R.string.romanskyStylePrimerText2)
                detailText9?.text = getString(R.string.romanskyStylePrimerText3)
                textView?.text = getString(R.string.romanskaya11)
                imageView?.setImageResource(R.drawable.romanskaya)
            }
            "Нормандская архитектура" -> {
                detailText?.text = getString(R.string.normandskaya)
                detailText2?.text = getString(R.string.normandskaya2)
                detailText3?.text = getString(R.string.normandskaya3)
                detailText4?.text = getString(R.string.normandskaya4)
                textView?.text = getString(R.string.norm)
                imageView?.setImageResource(R.drawable.norm)
            }
            "Готика" -> {
                detailText?.text = getString(R.string.ghotika)
                detailText2?.text = getString(R.string.ghotikaPeriod)
                detailText3?.text = getString(R.string.ghotikaRanni)
                detailText4?.text = getString(R.string.ghotikaVisoky)
                detailText5?.text = getString(R.string.ghotikaPozdni)
                detailText6?.text = getString(R.string.ghotikaOpis)
                detailText7?.text = getString(R.string.SvStephan)
                detailText8?.text = getString(R.string.Antvepentsky)
                textView?.text = getString(R.string.SoborSvStephana)
                imageView?.setImageResource(R.drawable.svstephan)
            }
            "Возрождение" -> {
                detailText?.text = getString(R.string.renessans)
                detailText2?.text = getString(R.string.osobennostiRenessansa)
                detailText3?.text = getString(R.string.vospiptatelniDomFlorensii)
                detailText4?.text = getString(R.string.vospiptatelniDomFlorensiiText)
                detailText6?.text = getString(R.string.zakluchenieRenessans)
                textView?.text = getString(R.string.VospitatelniDom)
                imageView?.setImageResource(R.drawable.vospitatelnidom)
            }
            "Барокко" -> {
                detailText?.text = getString(R.string.barokko)
                detailText2?.text = getString(R.string.osobennostiBarocco)
                detailText3?.text = getString(R.string.osobennostiBaroccoText)
                detailText4?.text = getString(R.string.osobennostiBaroccoText2)
                detailText5?.text = getString(R.string.baroccoHistory)
                detailText6?.text = getString(R.string.baroccoHistory2)
                detailText7?.text = getString(R.string.baroccoHistory3)
                detailText8?.text = getString(R.string.baroccoHistory4)
                detailText9?.text = getString(R.string.baroccoHistory5)
                textView?.text = getString(R.string.SvPavel)
                imageView?.setImageResource(R.drawable.barokko)
            }
            "Рококо" -> {
                detailText?.text = getString(R.string.rococo)
                detailText2?.text = getString(R.string.rococo2)
                detailText3?.text = getString(R.string.rococo3)
                detailText4?.text = getString(R.string.rococo4)
                detailText5?.text = getString(R.string.rococo5)
                detailText6?.text = getString(R.string.rococo6)
                detailText7?.text = getString(R.string.rococo7)
                textView?.text = getString(R.string.VeersalskiDvoretc)
                imageView?.setImageResource(R.drawable.versalskidvorets)
            }
            "Классицизм" -> {
                detailText?.text = getString(R.string.classicism)
                detailText2?.text = getString(R.string.classicism2)
                detailText3?.text = getString(R.string.classicism3)
                detailText4?.text = getString(R.string.classicism4)
                detailText5?.text = getString(R.string.classicism5)
                detailText6?.text = getString(R.string.classicism6)
                detailText7?.text = getString(R.string.classicism7)
                detailText8?.text = getString(R.string.classicism8)
                detailText9?.text = getString(R.string.classicism9)
                textView?.text = getString(R.string.smolni)
                imageView?.setImageResource(R.drawable.smolni)
            }
            "Историзм" -> {
                detailText?.text = getString(R.string.istorizm)
                detailText2?.text = getString(R.string.istorizm2)
                detailText3?.text = getString(R.string.istorizm3)
                detailText4?.text = getString(R.string.istorizm4)
                detailText5?.text = getString(R.string.istorizm5)
                detailText6?.text = getString(R.string.istorizm6)
                 textView?.text = getString(R.string.istorizm7)
                imageView?.setImageResource(R.drawable.istorizm)
            }
            "Модерн" -> {
                detailText?.text = getString(R.string.modern)
                detailText2?.text = getString(R.string.modern2)
                detailText3?.text = getString(R.string.modern3)
                detailText4?.text = getString(R.string.modern4)
                detailText5?.text = getString(R.string.modern5)
                detailText6?.text = getString(R.string.modern6)
                detailText7?.text = getString(R.string.modern7)
                detailText8?.text = getString(R.string.modern8)
                textView?.text = getString(R.string.modernPrim)
                imageView?.setImageResource(R.drawable.modern)
            }
            "Модернизм" -> {
                detailText?.text = getString(R.string.modernism)
                detailText2?.text = getString(R.string.modernism2)
                detailText3?.text = getString(R.string.modernism3)
                detailText4?.text = getString(R.string.modernism4)
                detailText5?.text = getString(R.string.modernism5)
                detailText6?.text = getString(R.string.modernism6)
                detailText7?.text = getString(R.string.modernism7)
                detailText8?.text = getString(R.string.modernism8)
                textView?.text = getString(R.string.hrustalDvor)
                imageView?.setImageResource(R.drawable.hrus)
            }
            "Конструктивизм" -> {
                detailText?.text = getString(R.string.konstructivism)
                detailText2?.text = getString(R.string.konstructivism2)
                detailText3?.text = getString(R.string.konstructivism3)
                detailText4?.text = getString(R.string.konstructivism4)
                detailText5?.text = getString(R.string.konstructivism5)
                textView?.text = getString(R.string.konstructivism6)
                imageView?.setImageResource(R.drawable.tret)
            }

            "Постмодернизм" -> {
                detailText?.text = getString(R.string.postmodernizm)
                detailText2?.text = getString(R.string.postmodernizm2)
                detailText3?.text = getString(R.string.postmodernizm3)
                detailText4?.text = getString(R.string.postmodernizm4)
                detailText5?.text = getString(R.string.postmodernizm5)
                detailText6?.text = getString(R.string.postmodernizm6)
                detailText7?.text = getString(R.string.postmodernizm7)
                detailText8?.text = getString(R.string.postmodernizm8)
                detailText9?.text = getString(R.string.postmodernizm9)
                textView?.text = getString(R.string.postmorernizmPtimer)
                imageView?.setImageResource(R.drawable.ziloidom)
            }
            "Хай-тек" -> {
                detailText?.text = getString(R.string.haiTec)
                detailText2?.text = getString(R.string.haiTec2)
                detailText3?.text = getString(R.string.haiTec3)
                detailText4?.text = getString(R.string.haiTec4)
                detailText5?.text = getString(R.string.haiTec5)
                detailText6?.text = getString(R.string.haiTec6)
                detailText7?.text = getString(R.string.haiTec7)
                textView?.text = getString(R.string.nationalnicentrHaiTec)
                imageView?.setImageResource(R.drawable.nationalnisentr)
            }
            "Деконструктивизм" -> {
                detailText?.text = getString(R.string.deconstructivizm)
                detailText2?.text = getString(R.string.deconstructivizm2)
                detailText3?.text = getString(R.string.deconstructivizm3)
                detailText4?.text = getString(R.string.deconstructivizm4)
                textView?.text = getString(R.string.TantsuyshiDom)
                imageView?.setImageResource(R.drawable.tand)
            }
            "Параметизм" -> {
                detailText?.text = getString(R.string.parametizm)
                detailText2?.text = getString(R.string.parametizm2)
                detailText3?.text = getString(R.string.parametizm3)
                detailText4?.text = getString(R.string.parametizm4)
                textView?.text = getString(R.string.DailanInternetionalConferenceCenter)
                imageView?.setImageResource(R.drawable.dalmezd)
            }
        }
    }

}