android-gridview-with-header-and-footer
===
This is a custom GridView that can add headers and footers like the ListView.

Google put the HeaderGridView's code here:
<https://android.googlesource.com/platform/packages/apps/Gallery2/+/idea133/src/com/android/photos/views/HeaderGridView.java>

The HeaderGridView provided by Google can add headers, but can't add footers. I use Google's code and do something to make the view can add footers. In addition,whe you use HeaderFooterGridView, you can call addHeaderView() and addFooterView() after you call setAdapter().

