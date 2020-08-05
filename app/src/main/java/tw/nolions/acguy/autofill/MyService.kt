package tw.nolions.acguy.autofill

import android.app.assist.AssistStructure
import android.os.Build
import android.os.CancellationSignal
import android.service.autofill.*
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.O)
class MyService : AutofillService() {
    override fun onFillRequest(
        request: FillRequest,
        cancellationSignal: CancellationSignal,
        callback: FillCallback
    ) {
        //自動填寫步驟：
        //1.得到最近一條需要填寫的表單（表單的所有內容）
        //自動填寫步驟：
        //1.得到最近一條需要填寫的表單（表單的所有內容）
        val structure: AssistStructure =
            request.fillContexts[request.fillContexts.size - 1].structure
        //2.獲取保存的自動填寫的表單的結果集Dataset放在FillResponse上
        //3.通過FillCallback把FillResponse的內容展示到界面交互
    }

    override fun onSaveRequest(request: SaveRequest, callback: SaveCallback) {
        val context: List<FillContext> = request.fillContexts
        //保存步驟：
        //1.得到最近一條需要填寫的表單（表單的所有內容）
        //保存步驟：
        //1.得到最近一條需要填寫的表單（表單的所有內容）
        val structure = context[context.size - 1].structure
        //2.解析記錄的數據AssistStructure
        //3.通過SharedPreferences,數據庫，文件等存儲方式保存下來
    }
}
