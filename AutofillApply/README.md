# Autofill 自動填充

此為`自動填充應用`範例，為含有自動填充服務建構部分

## 設置

透過在要加上Autofill功能元件的XML元素中加上`autofillHints`、`importantForAutofill`參數

```
<EditText
    android:id="@+id/password"
    android:layout_width="150sp"
    android:layout_height="wrap_content"
    android:importantForAutofill="yes"
    android:autofillHints="password"/>
```

或在程式碼中分別透過setAutofillHints()與setImportantForAutofill()

```
password.setAutofillHints(View.AUTOFILL_HINT_PASSWORD)
password.setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_YES)
```

其中`autofillHints`是提供Autofill提示，而`importantForAutofill`則是設定否允許Autofill設置

### importantForAutofill 參數值

|value|describe|
|-|-|
|auto|由Android去自動判斷是否允許Autofill|
|no|不允許Autofill|
|yes|允許Autofill|
|yesExcludeDescendants|允許Autofill，但其子項目則不允許|

詳細資訊可參考 [自動填充應用](https://developer.android.com/guide/topics/text/autofill-optimize)

ps1. 執行startActivity()切換Activity時需呼叫finish()，關閉原本Activity，才能觸發Autofill 保存資料功能

```
startActivity(Intent(this, WelcomeActivity::class.java))
finish()
```

ps2. 如果裝置系統沒有相關Autofill服務(EX: SAMSUNG PASS或Google Auth)，則需要自己建立Autofill服務，詳細請參考[建構自動填充服務](https://developer.android.com/guide/topics/text/autofill-optimize)
