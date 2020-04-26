package com.example.hellofragment;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HelloFragmentB extends Fragment {

    public interface SendCityNameListener {
        void newCity(String city);
    }

    private SendCityNameListener sendCityNameListener;  //Podany kod
    private TextView textView;                          //Podany kod
    private String textViewString;                      //Podany kod

    private EditText searchCity;                        //Podany kod

    //TODO zad. 3
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //TODO tutaj sprawdź czy interfejs HelloFragmentBLlistener jest zaimplementowany przez
        //     MainActivity, w tym celu użyj "instanceof", context to w pewnym sensie referencja
        //     do MainActivity. Jeżeli jest, to dołącz helloFragmentBListener do tej instancji, w
        //     tym celu musisz rzutować context na HelloFragmentBListener.
        //     Rzuć wyjątkiem RuntimeException jeśli nie jest.
    }


    //TODO zadanie 2.1: uzupełnij metodę onCreateview(...)
    //TODO zadanie 3:   komunikacja
    //TODO zadanie 4:   przygowtowanie do API
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TODO zad 2.1 użyj wyglądu z pliku hello_fragment_b.xml, plik ten wskazywany jest
        //     przez id - nazwa pliku bez rozszeżenia, poszczególen id layoutów przechowywane przez R.layout..
        //     Następnym krokiem jest "znalezienie" poszczególnych elementów zdefiniowanych w wyglądzie,
        //     plik zanjduje się w app/res/layout/

        //TODO zad. 3 za pomocą metody setText() zmień tekst wyświetlany przez textView na ten przechowywany w textViewString

        //TODO zad. 4 należy zmienić wygląd na hello_fragment_b_final.xml, znaleźć nowe elementy
        View view = inflater.inflate(/*tu wstaw odpowiedni layout*/, container, false);

// odkomentuj poniższy kod w trakcie wykonywania zadania 4
//        searchCity.setOnEditorActionListener(editorActionListener);
        return view;                                                                                //podany kod
    }

// odkomentuj poniższy kod w trakcie wykonywania zadania 4
//    private TextView.OnEditorActionListener editorActionListener = new TextView.OnEditorActionListener() {
//        @Override
//        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                String obtainedText = String.valueOf(searchCity.getText());
//                if (!obtainedText.isEmpty()) {
//                    sendCityNameListener.newCity(obtainedText);
//                    searchCity.setText("");
//                } else {
//                    Toast toast = Toast.makeText(getContext(), "Please enter city name",Toast.LENGTH_LONG);
//                    toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 200);
//                    toast.show();
//                }
//            }
//            return false;
//        }
//    };


    //TODO zad. 3
    void updateData(String text) {
        //TODO przypisz zawarotść zmiennej text do textViewString
    }

    //TODO zad. 4
    @Override
    public void onDetach() {
        super.onDetach();
        //TODO nadpisz zmienną helloFragmentBListener w taki sposób, aby garbage collector mógł ją usunąć
    }

}
