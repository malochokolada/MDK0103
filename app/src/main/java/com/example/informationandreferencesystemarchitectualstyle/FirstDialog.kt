package com.example.informationandreferencesystemarchitectualstyle

import android.media.tv.TvContract.PreviewPrograms
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class FirstDialog: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        /*return inflater.inflate(R.layout.previewdialog,container, false)
       var rootView = inflater.inflate(R.layout.previewdialog,container, false)
        var canselButton = rootView.findViewById<Button>(R.id.buttonclose)
        var continueButton = rootView.findViewById<Button>(R.id.buttoncontinue)

        canselButton.setOnClickListener(object :View.OnClickListener
        {
            override fun onClick (v:View?){
                dismiss()
            }
        })

return rootView*/
    }
}