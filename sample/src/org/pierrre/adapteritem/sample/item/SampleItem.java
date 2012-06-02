package org.pierrre.adapteritem.sample.item;

import org.pierrre.adapteritem.AdapterItem;
import org.pierrre.adapteritem.sample.R;

import android.content.Context;
import android.widget.TextView;

public class SampleItem extends AdapterItem {
	private final TextView text;
	
	public SampleItem(Context context) {
		super(context, R.layout.item_sample);
		
		this.text = this.findViewById(R.id.text);
	}
	
	public void update(int value) {
		this.text.setText(Integer.toString(value));
	}
}
