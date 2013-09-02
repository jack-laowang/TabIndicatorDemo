package com.example.tabindicatordemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tabindicatordemo.R;

public class TestFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment, null);

		ListView listview = (ListView) view.findViewById(R.id.listview);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_expandable_list_item_1);
		for (int i = 0; i < 30; i++) {
			adapter.add(String.valueOf(i));
		}
		listview.setAdapter(adapter);
		return view;
	}

}
