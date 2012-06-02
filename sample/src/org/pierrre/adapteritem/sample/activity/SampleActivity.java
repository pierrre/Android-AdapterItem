package org.pierrre.adapteritem.sample.activity;

import org.pierrre.adapteritem.AdapterItem;
import org.pierrre.adapteritem.sample.item.SampleItem;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class SampleActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setListAdapter(new SampleAdapter());
	}
	
	private class SampleAdapter extends BaseAdapter {
		@Override
		public int getCount() {
			return 100;
		}
		
		@Override
		public Object getItem(int position) {
			return null;
		}
		
		@Override
		public long getItemId(int position) {
			return 0;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			SampleItem item;
			
			if (convertView == null) {
				item = new SampleItem(SampleActivity.this);
				convertView = item.getView();
			} else {
				item = AdapterItem.getItem(convertView);
			}
			
			item.update(position);
			
			return convertView;
		}
	}
}
