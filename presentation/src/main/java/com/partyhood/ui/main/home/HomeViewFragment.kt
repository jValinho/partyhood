package com.partyhood.ui.main.home

import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.R
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.MainNavigator
import org.kodein.di.generic.instance


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class HomeViewFragment: BaseFragment<HomeState, HomeViewModel, MainNavigator.Navigation>() {

    override val viewModelSeed: HomeViewModel by instance()

    override val navigator: MainNavigator by instance()

    private var vm: HomeViewModel? = null

    override val layoutId: Int get() = R.layout.fragment_home


    override fun onInitialized(viewModel: HomeViewModel) {
        vm = viewModel
    }


    override fun onNormal(data: HomeState) {
    }


    override fun onAlternative(data: EmaExtraData) {

    }

    override fun onSingle(data: EmaExtraData) {

    }

    override fun onSingleEvent(data: EmaExtraData) {
    }

    override fun onError(error: Throwable) {
    }

    companion object{
        fun newInstance():  HomeViewFragment = HomeViewFragment()
    }

}
