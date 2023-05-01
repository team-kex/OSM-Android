package com.goms.presentation.di.module

import com.goms.data.datasource.auth.AuthDataSource
import com.goms.data.datasource.auth.AuthDataSourceImpl
import com.goms.data.datasource.token.ManageTokenDataSource
import com.goms.data.datasource.token.ManageTokenDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun provideSignInDataSource(
        signInDataSourceImpl: AuthDataSourceImpl
    ): AuthDataSource

    @Binds
    abstract fun bindManageTokenDataSource(
        manageTokenDataSourceImpl: ManageTokenDataSourceImpl
    ): ManageTokenDataSource
}