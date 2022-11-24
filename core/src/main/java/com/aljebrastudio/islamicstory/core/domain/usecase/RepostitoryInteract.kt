package com.aljebrastudio.islamicstory.core.domain.usecase

import androidx.lifecycle.LiveData
import com.aljebrastudio.islamicstory.core.domain.model.User
import com.aljebrastudio.islamicstory.core.domain.repository.RepositoryInterface
import com.aljebrastudio.islamicstory.core.utils.vo.Resource
import com.google.firebase.auth.AuthResult

class RepositoryInteract(private val repositoryInterface: RepositoryInterface) : UseCase {
    override fun getDataRegister(name: String, email: String, password: String): LiveData<Resource<AuthResult>> =
        repositoryInterface.getDataRegister(name, email, password)

    override fun getDataLogin(email: String, password: String): LiveData<Resource<AuthResult>> =
        repositoryInterface.getDataLogin(email, password)

    override fun getDataUser(uid: String): LiveData<Resource<User>> =
        repositoryInterface.getDataUser(uid)

}