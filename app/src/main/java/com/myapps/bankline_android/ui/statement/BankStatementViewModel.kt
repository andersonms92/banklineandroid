package com.myapps.bankline_android.ui.statement

import androidx.lifecycle.ViewModel
import com.myapps.bankline_android.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}