package com.reactnativereanimatedtext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = JBAnimatedTextViewManager.REACT_CLASS)
public class JBAnimatedTextViewManager extends SimpleViewManager<JBAnimatedTextComponentView> {

  public static final String REACT_CLASS = "JBAnimatedText";

  @NonNull
  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @NonNull
  @Override
  protected JBAnimatedTextComponentView createViewInstance(@NonNull ThemedReactContext reactContext) {
    return new JBAnimatedTextComponentView(reactContext);
  }

  @ReactProp(name = "text")
  public void setText(JBAnimatedTextComponentView view, @Nullable String text) {
    view.setText(text);
  }

  @ReactProp(name = "color", customType = "Color")
  public void setColor(JBAnimatedTextComponentView view, @Nullable Integer color) {
    view.setColor(color);
  }

  @ReactProp(name = "fontSize", defaultFloat = 14f)
  public void setFontSize(JBAnimatedTextComponentView view, float fontSize) {
    view.setFontSize(fontSize);
  }

  @ReactProp(name = "fontFamily")
  public void setFontFamily(JBAnimatedTextComponentView view, @Nullable String fontFamily) {
    view.setFontFamily(fontFamily);
  }

  @ReactProp(name = "fontWeight")
  public void setFontWeight(JBAnimatedTextComponentView view, @Nullable String fontWeight) {
    view.setFontWeight(fontWeight);
  }

  @ReactProp(name = "fontStyle")
  public void setFontStyle(JBAnimatedTextComponentView view, @Nullable String fontStyle) {
    view.setFontStyle(fontStyle);
  }

  @ReactProp(name = "textAlign")
  public void setTextAlign(JBAnimatedTextComponentView view, @Nullable String textAlign) {
    view.setTextAlign(textAlign);
  }

  @ReactProp(name = "numberOfLines", defaultInt = 0)
  public void setNumberOfLines(JBAnimatedTextComponentView view, int numberOfLines) {
    view.setNumberOfLines(numberOfLines);
  }

  @ReactProp(name = "lineHeight", defaultFloat = Float.NaN)
  public void setLineHeight(JBAnimatedTextComponentView view, float lineHeight) {
    view.setLineHeight(lineHeight);
  }

  @ReactProp(name = "textDecorationLine")
  public void setTextDecorationLine(JBAnimatedTextComponentView view, @Nullable String textDecorationLine) {
    view.setTextDecorationLine(textDecorationLine);
  }

  @ReactProp(name = "letterSpacing", defaultFloat = 0f)
  public void setLetterSpacing(JBAnimatedTextComponentView view, float letterSpacing) {
    view.setLetterSpacing(letterSpacing);
  }
}
